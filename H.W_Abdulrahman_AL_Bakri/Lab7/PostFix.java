package H.W.Lab7;

public class PostFix {
    protected  static int evalPostfix(String express)
    {
        StackLinkedList<Integer> st = new StackLinkedList<>() ;

        for(int i=0; i < express.length(); i++)
        {
            char ch = express.charAt(i);

            if(Character.isDigit(ch))
                st.push(ch - '0');
            else
            {
                int value1 = st.pop();
                int value2 = st.pop();

                switch(ch)
                {
                    case '+':
                        st.push(value2 + value1);
                        break;

                    case '-':
                        st.push(value2 - value1);
                        break;

                    case '*':
                        st.push(value2*value1);
                        break;
                    case '/':
                        st.push(value2/value1);
                        break;
                }
            }
        }
        System.out.println(st.top());
        return st.pop();
    }
}
