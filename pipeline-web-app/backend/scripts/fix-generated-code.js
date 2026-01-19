const fs = require('fs');
const path = require('path');

/**
 * Post-processes generated Python files to fix syntax issues
 * from Acceleo template escaping problems
 */
function fixGeneratedPythonCode(filePath) {
    if (!fs.existsSync(filePath)) {
        console.log(`⚠️  File not found: ${filePath}`);
        return false;
    }

    let content = fs.readFileSync(filePath, 'utf8');
    let originalContent = content;
    let fixes = [];

    // Fix 1: Dictionary access - params[key] → params['key']
    const dictAccessRegex = /params\[(\w+)\]/g;
    if (dictAccessRegex.test(content)) {
        content = content.replace(/params\[(\w+)\]/g, "params['$1']");
        fixes.push("Fixed dictionary key access");
    }

    // Fix 2: Column access in DataFrame - df[{col}] → df[col]
    const columnAccessRegex = /df\[\{(\w+)\}\]/g;
    if (columnAccessRegex.test(content)) {
        content = content.replace(/df\[\{(\w+)\}\]/g, 'df[$1]');
        fixes.push("Fixed column variable access");
    }

    // Fix 3: Tags array - tags=[generated], 'value'] → tags=['generated', 'value']
    const tagsRegex = /tags=\[generated\],\s*'([\w]+)'\]/g;
    if (tagsRegex.test(content)) {
        content = content.replace(/tags=\[generated\],\s*'([\w]+)'\]/g, "tags=['generated', '$1']");
        fixes.push("Fixed tags array syntax");
    }

    // Fix 4: Remove extra newlines in description
    content = content.replace(/description='([^']+)\\n\s*'/g, "description='$1'");

    // Only write if changes were made
    if (content !== originalContent) {
        fs.writeFileSync(filePath, content, 'utf8');
        console.log(`✅ Fixed ${path.basename(filePath)}: ${fixes.join(', ')}`);
        return true;
    } else {
        console.log(`ℹ️  No fixes needed for ${path.basename(filePath)}`);
        return false;
    }
}

/**
 * Fix all Python files in a directory
 */
function fixGeneratedFiles(directory) {
    const files = fs.readdirSync(directory);
    const pythonFiles = files.filter(f => f.endsWith('.py'));

    console.log(`\n🔧 Post-processing ${pythonFiles.length} Python files...\n`);

    let fixedCount = 0;
    pythonFiles.forEach(file => {
        const filePath = path.join(directory, file);
        if (fixGeneratedPythonCode(filePath)) {
            fixedCount++;
        }
    });

    console.log(`\n✅ Post-processing complete: ${fixedCount}/${pythonFiles.length} files fixed\n`);
    return fixedCount;
}

module.exports = {
    fixGeneratedPythonCode,
    fixGeneratedFiles
};

// CLI usage
if (require.main === module) {
    const targetDir = process.argv[2] || path.join(__dirname, '..', 'temp');
    fixGeneratedFiles(targetDir);
}
