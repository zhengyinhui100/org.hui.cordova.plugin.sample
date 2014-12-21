package org.hui.cordova.plugin.sample;

import org.apache.cordova.CallbackContext;
import org.apache.cordova.CordovaPlugin;
import org.json.JSONArray;
import org.json.JSONException;

import android.app.AlertDialog;

public class Sample extends CordovaPlugin {

	/**
	 * Constructor.
	 */
	public Sample() {
	}

	/**
	 * Executes the request and returns PluginResult.
	 * 
	 * @param action
	 *            The action to execute.
	 * @param args
	 *            JSONArray of arguments for the plugin.
	 * @param callbackContext
	 *            The callback context used when calling back into JavaScript.
	 * @return True when the action was valid, false otherwise.
	 */
	public boolean execute(String action, JSONArray args,
			CallbackContext callbackContext) throws JSONException {
		String msg=args.getString(0);
		String comment = args.getString(1);
		new AlertDialog.Builder(this.cordova.getActivity()).setTitle("标题")
				.setMessage("msg:"+msg+"\ncomment:"+comment)
				.setPositiveButton("确定", null).show();
		if (action.equals("succ")) {
			callbackContext.success("成功回调");
		} else {
			callbackContext.error("失败回调");
		}
		return true;
	}
}
