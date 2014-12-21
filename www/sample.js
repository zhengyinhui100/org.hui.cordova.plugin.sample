

var exec = require('cordova/exec');

module.exports = {

    test: function(param) {
    	exec(param.success, param.error, "Sample", param.action||"succ", 
    	[param.msg,param.comment]);
    }
};
