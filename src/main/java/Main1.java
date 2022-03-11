import org.apache.commons.lang3.StringUtils;
import org.apache.commons.cli.*;
import org.apache.commons.cli.ParseException;

public class Main1 {
    public static void main(String[] args) {

        Options options = new Options();
        CommandLineParser parser = new DefaultParser();

        try{
            CommandLine commandLine = parser.parse(options, args);
            for (String str : commandLine.getArgList()){
                System.out.print(StringUtils.capitalize(str) + " ");
            }
        } catch (ParseException e) {
            e.printStackTrace();

        }

    }
}