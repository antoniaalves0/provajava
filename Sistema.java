import javax.swing.JOptionPane;


public class Sistema {
    public static void main(String[] args) {
        Estudante e [] = new Estudante[5];
        int totalNotas=0;
        int x=0;
        int menu;
        do {

            menu = Integer.parseInt(JOptionPane.showInputDialog(null, " digite 1- cadastrar 2- Lançar Notas 3-Listar Resultado 4-Sair"));
            switch(menu){
                case 1:
                e[x] = new Estudante();
                e[x].cadastrar();
                x++;
                break;

                case 2:
                e[x] = new Estudante();
                e[x].lancarNotas();
                totalNotas = e[x].getNotaA1() + e[x].getNotaA2() + e[x].getNotaA3();
                break;


                case 3:

                for(int i=0; i<x; i++){
                    JOptionPane.showMessageDialog(null, "o aluno(a): " + e[i].getNome() +" , matricula: "+ e[i].getMatricula() + " , curso: "+e[i].getCurso() + " , uc: "+ e[i].getUc() + " (NOTA A1: "+ e[x].getNotaA1()+ " , NOTA A2: "+ e[x].getNotaA2() + " , NOTA A3: "+ e[x].getNotaA3() +" )" +"  O TOTAL DAS NOTAS É: " + totalNotas); 
                }
                
                if (totalNotas>=70){
                    JOptionPane.showMessageDialog(null, "Parabéns, você foi aprovado");
                } else {
                    JOptionPane.showMessageDialog(null, "Você irá fazer a Avaliação Substitutiva valendo 30 pts e substituir a A1 ou A2 que tiver a menor nota");
                }
                break;


                default: JOptionPane.showMessageDialog(null, "não é valido");
                
                
        }
        }while(menu!=4);
        JOptionPane.showMessageDialog(null, "fim do programa");        
    } 
}
