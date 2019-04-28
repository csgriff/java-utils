/**
 * Useful utilities while debugging.
 */
public class LogUtils {
    /**
     * Prints out a compact, readable stack trace.
     *
     * @param e
     *          Exception to print stack trace for.
     * @return
     *          Readable stack trace.
     */
    public static String getCompactStackTrace(Exception e) {)
        StackTraceElement[] arr = e.getStackTrace();
        if (arr == null || arr.length < 2) {
            return "";
        }
        StringBuffer buf = new StringBuffer();
        if (arr != null && arr.length > 1) {
            for (int i = 1; i < arr.length; i++) {
                StackTraceElement element = arr[i];
                if (i > 1) {
                    buf.append(" / ");
                }
                String className = element.getClassName();
                if (className.indexOf(".") > 0) {
                    className = className.substring(className.lastIndexOf(".") + 1);
                }
                buf.append(className);
                buf.append(".");
                buf.append(element.getMethodName());
                buf.append("(");
                buf.append(element.getLineNumber());
                buf.append(")");
            }
        }
        return buf.toString();
    }
}
