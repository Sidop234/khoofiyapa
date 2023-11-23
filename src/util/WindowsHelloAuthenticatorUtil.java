package util;

public class WindowsHelloAuthenticatorUtil {
    static {
        System.loadLibrary("WindowsHelloAuth"); // Load the Windows component's DLL
    }
    private static native boolean initiateWindowsHelloAuthentication();
    private static native boolean handleWindowsHelloResult();

    public static boolean authenticateWithWindowsHello() {
        if (initiateWindowsHelloAuthentication()) {
            return handleWindowsHelloResult();
        }
        return false;
    }
}
