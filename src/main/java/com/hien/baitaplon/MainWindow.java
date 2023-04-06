
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
        commands.add(new Command(3,"Tinh lai theo so tai khoan", () ->
        {
            System.out.println("Handle success");
            return null;
        }));
        commands.add(new Command(4,"Tra cuu khach hang theo ho ten va ma so khach hang: ", () ->
        {
            System.out.println("Handle success");
            return null;
        }));
        commands.add(new Command(5,"Tra cuu danh sach tai khoan cua mot khach hang theo ma khach hang: ", () ->
        {
            System.out.println("Handle success");
            return null;
        }));
        commands.add(new Command(6,"Sap xep danh sach khach hang co tong so tien gui giam dan:  ", () ->
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
