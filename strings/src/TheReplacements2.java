import java.util.regex.*;
import java.nio.file.*;
import java.util.stream.*;
/*! Here's a block of text to use as input to the regular expression matcher.
Note that we first extract the block of text by looking for the special delimiters,
then process the extracted block.!*/

public class TheReplacements2 {
    public static void main(String[] args) throws Exception{
        String s = Files.lines(Paths.get("strings/src/TheReplacements2.java"))
                .collect(Collectors.joining("\n"));
        // 根据正则表达式来匹配上述那段特殊标识下的英文片段
        Matcher mInput = Pattern.compile("/\\*!(.*)!\\*/", Pattern.DOTALL).matcher(s);
        if (mInput.find()){
            s = mInput.group(1); // 按照第一组括号下的规则进行捕获
        }
        s = s.replaceAll(" {2,}", " ");
        s = s.replaceAll("(?m)^ +", "");
        System.out.println(s);
        s = s.replaceFirst("[aeiou]", "(VOWEL1)");
        StringBuffer sbuf = new StringBuffer();
        Pattern p = Pattern.compile("[aeiou]");
        Matcher m = p.matcher(s);
        while (m.find())
            m.appendReplacement(sbuf, m.group().toUpperCase());
        m.appendTail(sbuf);
        System.out.println(sbuf);

    }
}
