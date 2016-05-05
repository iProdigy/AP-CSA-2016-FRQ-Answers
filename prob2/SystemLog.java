package prob2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SystemLog {
    /**
     * Contains all the entries in this system log.
     * Guaranteed not to be null and to contain only non-null entries.
     */
    private List<LogMessage> messageList;

    public SystemLog(List<LogMessage> messages) {
        this.messageList = new ArrayList<>(messages);
    }

    public SystemLog(LogMessage... messages) {
        this(Arrays.asList(messages));
    }

    /**
     * Problem 2.c
     * <p>
     * Removes from the system log all entries whose descriptions properly contain keyword, and returns a
     * (possibly empty) list containing the removed entries
     * <p>
     * <b>Postcondition</b>:
     * <p>
     * - Entries in the returned list properly contain <i>keyword</i> and are in the order in which they
     * appeared in the system log.
     * <p>
     * - The remaining entries in the system log do not properly contain <i>keyword</i> and are in their
     * original order.
     * <p>
     * - The returned list is empty if no messages properly contain <i>keyword</i>.
     *
     * @param keyword the word to check for
     * @return the log messages that were removed
     */
    public List<LogMessage> removeMessages(String keyword) {
        List<LogMessage> removed = new ArrayList<>();

        for (int index = 0; index < messageList.size(); index++) {
            LogMessage msg = messageList.get(index);

            if (msg.containsWord(keyword)) {
                removed.add(messageList.remove(index));
                index--;
            }
        }

        return removed;
    }

    public List<LogMessage> getMessages() {
        return this.messageList;
    }
}
