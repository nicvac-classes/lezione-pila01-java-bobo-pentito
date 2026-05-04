public class TestPila {

    public static boolean parentesiBilanciate(String espressione) {
        Pila<Character> pila = new Pila<>();

        for (int i = 0; i < espressione.length(); i++) {
            char c = espressione.charAt(i);

            if (c == '(' || c == '[' || c == '{') {
                pila.push(c);
            } else if (c == ')' || c == ']' || c == '}') {
                if (pila.isEmpty()) {
                    return false;
                }

                char aperta = pila.pop();

                if (!corrispondono(aperta, c)) {
                    return false;
                }
            }
        }

        return pila.isEmpty();
    }

    private static boolean corrispondono(char aperta, char chiusa) {
        return (aperta == '(' && chiusa == ')')
            || (aperta == '[' && chiusa == ']')
            || (aperta == '{' && chiusa == '}');
    }

    public static void main(String[] args) {
        String[] test = {"{[()]}", "{[(])}", "((()))", "(]", "{[}", ""};
        boolean[] atteso = {true, false, true, false, false, true};

        for (int i = 0; i < test.length; i++) {
            boolean risultato = parentesiBilanciate(test[i]);
            String esito = (risultato == atteso[i]) ? "✓" : "✗";
            System.out.println(esito + " \"" + test[i] + "\" → " + risultato);
        }
    }
}//Implementare qui la classe TestPila, per l'esercizio delle parentesi bilanciate
