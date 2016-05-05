package prob2;

public class SystemLogTester {

    public static void main(String[] args) {
        LogMessage[] logs = {
                new LogMessage("CLIENT3:security alert - repeated login failures"),
                new LogMessage("Webserver:disk offline"),
                new LogMessage("SERVER1:file not found"),
                new LogMessage("SERVER2:read error on disk DSK1"),
                new LogMessage("SERVER1:write error on disk DSK2"),
                new LogMessage("Webserver:error on /dev/disk")
        };

        SystemLog sysLog = new SystemLog(logs);

        System.out.printf("Removed: %s\n", sysLog.removeMessages("disk"));
        System.out.printf("Remaining: %s\n", sysLog.getMessages());
    }

}
