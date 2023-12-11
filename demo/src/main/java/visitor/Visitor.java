package visitor;

import java.util.Map;

public interface Visitor {
    Map<String, String> onSignature(Task<T> task);
    Map<String, String> onGroupStart(Task<T> task);
    Map<String, String> onGroupEnd(Task<T> task);

    <T> Map<Object, Object> onSignature(Signature<T> tSignature);
}
