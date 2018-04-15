public class Main {

    public interface Command {
        public void execute();
    }

    public static void main(String[] args) {

        boolean debug = false;

        if(args.length < 1|| args.length > 2 && !args[0].equalsIgnoreCase("echo" )){
            WorkPart z = new WorkPart();
            z.execute();
            }

        else if(args[0].equalsIgnoreCase("debug") || args[0].equalsIgnoreCase("-d"))
        {
            Debug a = new Debug();
            a.execute();
        }

        else if(args[0].equalsIgnoreCase("help") || args[0].equalsIgnoreCase("-h"))
        {
            Help b = new Help();
            b.execute();
            WorkPart z = new WorkPart();
            z.execute();
        }
    }
}