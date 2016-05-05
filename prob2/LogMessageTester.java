package prob2;

public class LogMessageTester {

    public static void main(String[] args) {
        LogMessage[] logs = {
                new LogMessage("a:disk"),
                new LogMessage("b:error on disk"),
                new LogMessage("c:error on /dev/disk disk"),
                new LogMessage("d:error on disk DSK1"),
                new LogMessage("e:DISK"),
                new LogMessage("f:error on disk3"),
                new LogMessage("g:error on /dev/disk"),
                new LogMessage("h:diskette")
        };

        final String keyword = "disk";

        for (LogMessage msg : logs) {
            System.out.printf("%s : %b\n", msg.getDescription(), msg.containsWord(keyword));
        }
    }

}
