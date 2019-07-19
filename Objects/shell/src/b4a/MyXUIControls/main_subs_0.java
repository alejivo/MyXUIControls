package b4a.MyXUIControls;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class main_subs_0 {


public static RemoteObject  _activity_create(RemoteObject _firsttime) throws Exception{
try {
		Debug.PushSubsStack("Activity_Create (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,26);
if (RapidSub.canDelegate("activity_create")) { return b4a.MyXUIControls.main.remoteMe.runUserSub(false, "main","activity_create", _firsttime);}
Debug.locals.put("FirstTime", _firsttime);
 BA.debugLineNum = 26;BA.debugLine="Sub Activity_Create(FirstTime As Boolean)";
Debug.ShouldStop(33554432);
 BA.debugLineNum = 28;BA.debugLine="Activity.LoadLayout(\"button\")";
Debug.ShouldStop(134217728);
main.mostCurrent._activity.runMethodAndSync(false,"LoadLayout",(Object)(RemoteObject.createImmutable("button")),main.mostCurrent.activityBA);
 BA.debugLineNum = 29;BA.debugLine="End Sub";
Debug.ShouldStop(268435456);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _activity_pause(RemoteObject _userclosed) throws Exception{
try {
		Debug.PushSubsStack("Activity_Pause (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,35);
if (RapidSub.canDelegate("activity_pause")) { return b4a.MyXUIControls.main.remoteMe.runUserSub(false, "main","activity_pause", _userclosed);}
Debug.locals.put("UserClosed", _userclosed);
 BA.debugLineNum = 35;BA.debugLine="Sub Activity_Pause (UserClosed As Boolean)";
Debug.ShouldStop(4);
 BA.debugLineNum = 37;BA.debugLine="End Sub";
Debug.ShouldStop(16);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _activity_resume() throws Exception{
try {
		Debug.PushSubsStack("Activity_Resume (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,31);
if (RapidSub.canDelegate("activity_resume")) { return b4a.MyXUIControls.main.remoteMe.runUserSub(false, "main","activity_resume");}
 BA.debugLineNum = 31;BA.debugLine="Sub Activity_Resume";
Debug.ShouldStop(1073741824);
 BA.debugLineNum = 33;BA.debugLine="End Sub";
Debug.ShouldStop(1);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _globals() throws Exception{
 //BA.debugLineNum = 21;BA.debugLine="Sub Globals";
 //BA.debugLineNum = 24;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}

public static void initializeProcessGlobals() {
    
    if (main.processGlobalsRun == false) {
	    main.processGlobalsRun = true;
		try {
		        main_subs_0._process_globals();
starter_subs_0._process_globals();
main.myClass = BA.getDeviceClass ("b4a.MyXUIControls.main");
starter.myClass = BA.getDeviceClass ("b4a.MyXUIControls.starter");
xuiimagebutton.myClass = BA.getDeviceClass ("b4a.MyXUIControls.xuiimagebutton");
animatedcounter.myClass = BA.getDeviceClass ("b4a.MyXUIControls.animatedcounter");
anotherprogressbar.myClass = BA.getDeviceClass ("b4a.MyXUIControls.anotherprogressbar");
b4xbreadcrumb.myClass = BA.getDeviceClass ("b4a.MyXUIControls.b4xbreadcrumb");
b4xcolortemplate.myClass = BA.getDeviceClass ("b4a.MyXUIControls.b4xcolortemplate");
b4xcombobox.myClass = BA.getDeviceClass ("b4a.MyXUIControls.b4xcombobox");
b4xdatetemplate.myClass = BA.getDeviceClass ("b4a.MyXUIControls.b4xdatetemplate");
b4xdialog.myClass = BA.getDeviceClass ("b4a.MyXUIControls.b4xdialog");
b4xfloattextfield.myClass = BA.getDeviceClass ("b4a.MyXUIControls.b4xfloattextfield");
b4xinputtemplate.myClass = BA.getDeviceClass ("b4a.MyXUIControls.b4xinputtemplate");
b4xlisttemplate.myClass = BA.getDeviceClass ("b4a.MyXUIControls.b4xlisttemplate");
b4xloadingindicator.myClass = BA.getDeviceClass ("b4a.MyXUIControls.b4xloadingindicator");
b4xlongtexttemplate.myClass = BA.getDeviceClass ("b4a.MyXUIControls.b4xlongtexttemplate");
b4xplusminus.myClass = BA.getDeviceClass ("b4a.MyXUIControls.b4xplusminus");
b4xsearchtemplate.myClass = BA.getDeviceClass ("b4a.MyXUIControls.b4xsearchtemplate");
b4xsignaturetemplate.myClass = BA.getDeviceClass ("b4a.MyXUIControls.b4xsignaturetemplate");
b4xswitch.myClass = BA.getDeviceClass ("b4a.MyXUIControls.b4xswitch");
b4xtimedtemplate.myClass = BA.getDeviceClass ("b4a.MyXUIControls.b4xtimedtemplate");
b4xformatter.myClass = BA.getDeviceClass ("b4a.MyXUIControls.b4xformatter");
roundslider.myClass = BA.getDeviceClass ("b4a.MyXUIControls.roundslider");
scrollinglabel.myClass = BA.getDeviceClass ("b4a.MyXUIControls.scrollinglabel");
swiftbutton.myClass = BA.getDeviceClass ("b4a.MyXUIControls.swiftbutton");
		
        } catch (Exception e) {
			throw new RuntimeException(e);
		}
    }
}public static RemoteObject  _process_globals() throws Exception{
 //BA.debugLineNum = 15;BA.debugLine="Sub Process_Globals";
 //BA.debugLineNum = 19;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
}