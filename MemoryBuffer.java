import java.util.Stack;

public class MemoryBuffer {
    private StringBuilder buffer;
    private Stack<String> undoStack;

    public MemoryBuffer() {
        buffer = new StringBuilder();
        undoStack = new Stack<>();
    }

    public void append(String text) {
        undoStack.push(buffer.toString()); // Push current state onto the stack
        buffer.append(text);
    }

    public void delete(int length) {
        if (length <= buffer.length()) {
            undoStack.push(buffer.toString()); // Push current state onto the stack
            buffer.delete(buffer.length() - length, buffer.length());
        } else {
            System.out.println("Invalid length for delete operation.");
        }
    }

    public void undo() {
        if (!undoStack.isEmpty()) {
            buffer = new StringBuilder(undoStack.pop()); // Restore buffer to previous state
        } else {
            System.out.println("Nothing to undo.");
        }
    }

    public String getContent() {
        return buffer.toString();
    }

    public static void main(String[] args) {
        MemoryBuffer buffer = new MemoryBuffer();
        System.out.println("MemoryBuffer");
        // Perform some operations
        buffer.append("Hello ");
        buffer.append("World!");
        System.out.println("Content: " + buffer.getContent()); // Output: Hello World!

        // Perform undo
        buffer.undo();
        System.out.println("Content after undo: " + buffer.getContent()); // Output: Hello

        // Perform more operations
        buffer.append("OpenAI");
        System.out.println("Content after additional append: " + buffer.getContent()); // Output: Hello OpenAI

        // Perform undo again
        buffer.undo();
        System.out.println("Content after second undo: " + buffer.getContent()); // Output: Hello

        buffer.delete(3);
        System.out.println("Content after delete: " + buffer.getContent());
    }
}
