package tracom.pos.toastermessage;

import android.content.Context;
import android.widget.Toast;

public class ToastMessage {
    public static void s(Context context, String message){
        Toast.makeText(context, message, Toast.LENGTH_SHORT).show();
    }

    public static void getTerminalSerialNo(Context context, String terminalSerial){
        Toast.makeText(context, terminalSerial + " :serial no.", Toast.LENGTH_SHORT).show();
    }

    public void getTerminalSignalStrength(Context context, String signalStrength){
        Toast.makeText(context, signalStrength + " :signal strength", Toast.LENGTH_SHORT).show();
    }
}
