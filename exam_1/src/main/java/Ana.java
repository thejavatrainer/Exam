public class Ana {
    String[] sir = new String[]{"Diana", "Roxana", "Dana", "Ana", "Moana", "Alina"};

    public void containAna() {
        System.out.print(" Urmatoarele stringuri contin substringul 'ana' :");
        for (int i = 0; i < sir.length; i++) {
            if (sir[i].toLowerCase().contains("ana")) {
                System.out.print(sir[i] + " ");


            }
        }
    }

    public static void main(String args[]) {
        Ana test = new Ana();
        test.containAna();
    }
}
