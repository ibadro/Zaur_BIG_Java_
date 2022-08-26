//package Zadania;
//
//public class Kata {
//    public static void main(String[] args) {
//        String[] spamKeywords = {"spam", "bad"};
//        int commentMaxLength = 40;
//        TextAnalyzer[] textAnalyzers1 = {
//                new SpamAnalyzer(spamKeywords),
//                new NegativeTextAnalyzer(),
//                new TooLongTextAnalyzer(commentMaxLength)
//        };
//        TextAnalyzer[] textAnalyzers2 = {
//                new SpamAnalyzer(spamKeywords),
//                new TooLongTextAnalyzer(commentMaxLength),
//                new NegativeTextAnalyzer()
//        };
//        TextAnalyzer[] textAnalyzers3 = {
//                new TooLongTextAnalyzer(commentMaxLength),
//                new SpamAnalyzer(spamKeywords),
//                new NegativeTextAnalyzer()
//        };
//        TextAnalyzer[] textAnalyzers4 = {
//                new TooLongTextAnalyzer(commentMaxLength),
//                new NegativeTextAnalyzer(),
//                new SpamAnalyzer(spamKeywords)
//        };
//        TextAnalyzer[] textAnalyzers5 = {
//                new NegativeTextAnalyzer(),
//                new SpamAnalyzer(spamKeywords),
//                new TooLongTextAnalyzer(commentMaxLength)
//        };
//        TextAnalyzer[] textAnalyzers6 = {
//                new NegativeTextAnalyzer(),
//                new TooLongTextAnalyzer(commentMaxLength),
//                new SpamAnalyzer(spamKeywords)
//        };
//        // тестовые комментарии
//        String[] tests = new String[8];
//        tests[0] = "This comment is so good.";                            // OK
//        tests[1] = "This comment is so Loooooooooooooooooooooooooooong."; // TOO_LONG
//        tests[2] = "Very negative comment !!!!=(!!!!;";                   // NEGATIVE_TEXT
//        tests[3] = "Very BAAAAAAAAAAAAAAAAAAAAAAAAD comment with :|;";    // NEGATIVE_TEXT or TOO_LONG
//        tests[4] = "This comment is so bad....";                          // SPAM
//        tests[5] = "The comment is a spam, maybeeeeeeeeeeeeeeeeeeeeee!";  // SPAM or TOO_LONG
//        tests[6] = "Negative bad :( spam.";                               // SPAM or NEGATIVE_TEXT
//        tests[7] = "Very bad, very neg =(, very ..................";      // SPAM or NEGATIVE_TEXT or TOO_LONG
//        TextAnalyzer[][] textAnalyzers = {textAnalyzers1, textAnalyzers2, textAnalyzers3,
//                textAnalyzers4, textAnalyzers5, textAnalyzers6};
//        Main testObject = new Main();
//        int numberOfAnalyzer; // номер анализатора, указанный в идентификаторе textAnalyzers{№}
//        int numberOfTest = 0; // номер теста, который соответствует индексу тестовых комментариев
//        for (String test : tests) {
//            numberOfAnalyzer = 1;
//            System.out.print("test #" + numberOfTest + ": ");
//            System.out.println(test);
//            for (TextAnalyzer[] analyzers : textAnalyzers) {
//                System.out.print(numberOfAnalyzer + ": ");
//                System.out.println(testObject.checkLabels(analyzers, test));
//                numberOfAnalyzer++;
//            }
//            numberOfTest++;
//        }
//    }
//
//    public Label checkLabels(TextAnalyzer[] analyzers, String text) {
//        Label label;
//        for (TextAnalyzer analyzer : analyzers) {
//            label = analyzer.processText(text);
//            if (label != Label.OK) return label;
//        }
//        return Label.OK;
//    }
//
//    enum Label {
//        SPAM, NEGATIVE_TEXT, TOO_LONG, OK
//    }
//
//    interface TextAnalyzer {
//        Label processText(String text);
//    }
//
//    class TooLongTextAnalyzer implements TextAnalyzer {
//        private int maxLength;
//
//        public TooLongTextAnalyzer(int maxLength) {
//            this.maxLength = maxLength;
//        }
//
//        public Label processText(String text) {
//            return (text.length() > maxLength) ? Label.TOO_LONG : Label.OK;
//        }
//    }
//
//    class SpamAnalyzer extends KeywordAnalyzer implements TextAnalyzer {
//        private String[] keywords;
//
//        public SpamAnalyzer(String[] keywords) {
//            this.keywords = keywords;
//        }
//
//        public String[] getKeywords() {
//            return this.keywords;
//        }
//
//        public Label getLabel() {
//            return Label.SPAM;
//        }
//    }
//
//    class NegativeTextAnalyzer extends KeywordAnalyzer implements TextAnalyzer {
//        private final String[] keywords = {":(", "=(", ":|"};
//
//        public String[] getKeywords() {
//            return this.keywords;
//        }
//
//        public Label getLabel() {
//            return Label.NEGATIVE_TEXT;
//        }
//    }
//
//    public abstract class KeywordAnalyzer implements TextAnalyzer {
//        public abstract String[] getKeywords();
//
//        public abstract Label getLabel();
//
//        public Label processText(String text) {
//            String[] keywords = getKeywords();
//            Label label = getLabel();
//            for (String str : keywords) if (text.toLowerCase().contains(str)) return label;
//            return Label.OK;
//        }
//    }
//
//
//}
