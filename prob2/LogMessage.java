package prob2;

public class LogMessage {
    private String machineId;
    private String description;

    /**
     * Problem 2.a
     * <p>
     * Constructs a new LogMessage using the passed <i>message</i>
     *
     * @param message the log message
     */
    public LogMessage(String message) {
        int colonIndex = message.indexOf(':');
        this.machineId = message.substring(0, colonIndex);
        this.description = message.substring(colonIndex + 1);
    }

    /**
     * Problem 2.b
     *
     * @param keyword the word to check for
     * @return true if the description in this log message properly contains <i>keyword</i>, false otherwise.
     */
    public boolean containsWord(String keyword) {
        final int dLength = description.length();

        if (keyword.length() > dLength)
            return false;

        if ((keyword == this.description) || (keyword.equals(description)))
            return true;

        String[] words = description.split(" ");

        for (String word : words) {
            if (word.equals(keyword))
                return true;
        }

        return false;
    }

    /*
     * Methods below weren't to be written by students
     */

    public String getMachineId() {
        return this.machineId;
    }

    public String getDescription() {
        return this.description;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        LogMessage that = (LogMessage) o;

        if (machineId != null ? !machineId.equals(that.machineId) : that.machineId != null) return false;
        return description != null ? description.equals(that.description) : that.description == null;

    }

    @Override
    public int hashCode() {
        int result = machineId != null ? machineId.hashCode() : 0;
        result = 31 * result + (description != null ? description.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return this.machineId + ":" + this.description;
    }
}
