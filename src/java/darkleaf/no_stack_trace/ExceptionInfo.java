package darkleaf.no_stack_trace;

import clojure.lang.IExceptionInfo;
import clojure.lang.IPersistentMap;

public class ExceptionInfo extends RuntimeException implements IExceptionInfo {
    public final IPersistentMap data;

    public ExceptionInfo(String s, IPersistentMap data) {
        this(s, data, null);
    }

    public ExceptionInfo(String s, IPersistentMap data, Throwable throwable) {
        super(s, throwable, true, false);
        if (data != null) {
            this.data = data;
        }  else {
            throw new IllegalArgumentException("Additional data must be non-nil.");
        }
    }
    public IPersistentMap getData() {
        return data;
    }

    public String toString() {
        return "ExceptionInfo: " + getMessage() + " " + data.toString();
    }
}
