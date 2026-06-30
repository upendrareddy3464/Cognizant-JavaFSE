public class SingletonDemo {
    public static void main(String[] args) {
        AppLogger logger1 = AppLogger.getLogger();
        AppLogger logger2 = AppLogger.getLogger();
        logger1.writeLog("Application is running");
        System.out.println("Same Object: " + (logger1 == logger2));
    }
}
class AppLogger {
    private static AppLogger instance;
    private AppLogger() {
        System.out.println("Logger initialized");
    }
    public static AppLogger getLogger() {
        if (instance == null) {
            instance = new AppLogger();
        }
        return instance;
    }
    public void writeLog(String message) {
        System.out.println("Log Message: " + message);
    }
}