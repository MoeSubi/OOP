
import java.util.ArrayList;
public class MainWindow extends ConsoleWindow {
    ArrayList<Command> commands;
    public MainWindow() {
        commands = new ArrayList<>();
        commands.add(new Command(1,"Mo tai khoan", () ->
        {
            System.out.println("Handle success");
            return null;
        }));
        commands.add(new Command(2,"Dang nhap", () ->
        {
            System.out.println("Handle success");
            return null;
        }));
        commands.add(new Command(3,"Tra cuu khach hang", () ->
        {
            System.out.println("Tra cuu tai khoan");
            return null;
        }));
        commands.add(new Command(4,"Sap xep ", () ->
        {
            System.out.println("Handle success");
            return null;
        }));
    }
    @Override
    public void OnDraw() {
        for (Command command : commands) {
            System.out.println(command.toString());
        }
        InputHandler.handleInt("Your input?", this::ProcessInput, ()->-1);
    }
    @Override
    public void ProcessInput(String input) {
        int value = Utility.tryParseInt(input, ()-> -1);
        if(value == -1){
            System.out.println("Wrong input");
            OnDraw();
            return;
        }
        var commandIndex = commands.stream().filter(e->e.getIndex() == value).findAny().orElse(null);
        if(commandIndex == null){
            System.out.println("Wrong input");
            OnDraw();
            return;
        }
        commandIndex.Handle();
    }
    public void ProcessInput(int value) {
        if(value == -1) {
            System.out.println("Wrong input");
            OnDraw();
            return;
        }
        var commandIndex = commands.stream().filter(e->e.getIndex() == value).findAny().orElse(null);
        if(commandIndex == null){
            System.out.println("Wrong input");
            OnDraw();
            return;
        }
        commandIndex.Handle();
    }
}
