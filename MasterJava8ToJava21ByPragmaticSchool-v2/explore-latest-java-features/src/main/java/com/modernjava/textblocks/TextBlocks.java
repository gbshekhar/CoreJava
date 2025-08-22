package com.modernjava.textblocks;

public class TextBlocks {



    public static String multiLineString() {

        var multiLine = "This is a\n" +
                "    multiline string\n" +
                "with newlines inside";

        return  multiLine;
    }

    public static String multiLineStringV2() {

        var multiLine = """
                This is a
                 multiline string
                with newlines inside
                """;

        return  multiLine;
    }

    public static String multiLineStringWithFormat(String name) {

        var multiLine = """
                Hello, %s!
                This is a
                multiline string
                with newlines inside
                """.formatted(name);

        return  multiLine;
    }

    public static String sql() {

        var multiLine = """
                select * from employee
                where first_name = 'bheem'
                and last_name = 'shekhar';
                """;

        return  multiLine;
    }

    public static String json() {

        var multiLine = """
                {
                 "name" : "shekhar",
                 "city" : "Atp"
                 "pincode" : 515001
                }
                """;

        return  multiLine;
    }


    public static void main(String[] args) {

        System.out.println("multiLineString = " + multiLineString());
        System.out.println("multiLineStringV2 = " + multiLineStringV2());
        System.out.println("multiLineStringWithFormat = " + multiLineStringWithFormat("Bheem"));
        System.out.println("sql = " + sql());
        System.out.println("json = " + json());
    }
}
