package Vokin.lab3Tasks;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Task_string
{
    private String MainUserString;
    private String most_common_symbol_ch;
    private String longest_word_s;
    private String every_third_word_deleted_s;
    public String every_third_word_deleted()
    {
        return every_third_word_deleted_s;
    }
    public String longest_word()
    {
        return longest_word_s;
    }
    public String most_common_symbol()
    {
        return most_common_symbol_ch;
    }
    public void set_MainUserString(String MainUserString) throws
            EmptyInputStringException
    {
        if (MainUserString.isEmpty())
        {
            throw new EmptyInputStringException("String is input");
            //System.out.println("String is Empty");
        }
        else {
            this.MainUserString = MainUserString;
            first();
            second();
            third();
        }
    }
    Task_string()
    {
        MainUserString = "Hello I am test string, and i have 10 words";
        first();
        second();
        third();
    }
    public Task_string(String s) throws EmptyInputStringException {
        set_MainUserString(s);
    }
    private void first(){
        most_common_symbol_ch = "";
        String UserString = MainUserString;
        List<Character> list = new ArrayList<>();
        for (int i = 0; i<UserString.length(); i++)
        {
            list.add(UserString.charAt(i));
        }
        Collections.sort(list);
        char potential = list.get(0);
        int count = 1;
        int max = 0;
        char most = ' ';
        for (int i = 1; i < list.size(); i++)
        {
            if (list.get(i) == potential)
            {
                count++;
            }
            else
            {
                if (max < count)
                {
                    max = count;
                    most = potential;
                }
                count = 1;
                potential = list.get(i);
            }
        }
        if (max < count)
        {
            max = count;
            most = potential;
        }
        most_common_symbol_ch += most;
    }
    private void second(){
        String UserString = MainUserString;
        String[] words = UserString.split(" ");
        int max_length = 0;
        String longest_word = " ";
        for (String i : words)
        {
            if (i.length() > max_length)
            {
                max_length = i.length();
                longest_word = i;
            }
        }
        this.longest_word_s = (longest_word);
    }
    private void third(){
        String UserString = MainUserString;
        ArrayList<String> final_ = new ArrayList<>();
        String[] words = UserString.split(" ");
        int count = 1;
        for (String i : words)
        {
            if (count % 3 == 0)
            {
                count += 1;
                continue;
            }
            final_.add(i);
            count++;
        }
        every_third_word_deleted_s = (String.join(" ", final_));
    }
    public class EmptyInputStringException extends Exception
    {
        public EmptyInputStringException() {
        }
        public EmptyInputStringException(String message) {
            super(message);
        }
        public EmptyInputStringException(String message, Throwable cause) {
            super(message, cause);
        }
        public EmptyInputStringException(Throwable cause) {
            super(cause);
        }
        public EmptyInputStringException(String message, Throwable cause,
                                         boolean enableSuppression, boolean writableStackTrace) {
            super(message, cause, enableSuppression, writableStackTrace);
        }
    }
}
