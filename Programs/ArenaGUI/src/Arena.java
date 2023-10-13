import java.io.PrintWriter;

public class Arena extends Character {

    private PrintWriter writer;

    // Construct
    public Arena(String name) {
        super(name, 100, 50, 50);
    }

    public void setPrintWriter(PrintWriter writer) {
        this.writer = writer;
    }

    public void LoadArena() {
        // ...
        writer.println("What is your character name? : ");
        String getName = name.next();
        Player1.setName(getName);
        writer
