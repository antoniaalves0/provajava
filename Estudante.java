import javax.swing.JOptionPane;

public class Estudante {
    private String nome; 
    private String matricula;
    private String tel;
    private String email;
    private String curso;
    private String uc;
    private int notaA1;
    private int notaA2;
    private int notaA3;

    public Estudante(){

    }


    public Estudante(String nome, String matricula, String tel, String email, String curso, String uc, int notaA1,
    int notaA2, int notaA3) {
        this.nome = nome;
        this.matricula = matricula;
        this.tel = tel;
        this.email = email;
        this.curso = curso;
        this.uc = uc;
        this.notaA1 = notaA1;
        this.notaA2 = notaA2;
        this.notaA3 = notaA3;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public String getUc() {
        return uc;
    }

    public void setUc(String uc) {
        this.uc = uc;
    }

    public int getNotaA1() {
        return notaA1;
    }

    public void setNotaA1( int notaA1) {
        this.notaA1 = notaA1;
    }

    public int getNotaA2() {
        return notaA2;
    }

    public void setNotaA2(int notaA2) {
        this.notaA2 = notaA2;
    }

    public int getNotaA3() {
        return notaA3;
    }

    public void setNotaA3(int notaA3) {
        this.notaA3 = notaA3;
    }



    @Override
    public String toString() {
        return "Estudante [nome=" + nome + ", matricula=" + matricula + ", tel=" + tel + ", email=" + email + ", curso="
                + curso + ", uc=" + uc + ", notaA1=" + notaA1 + ", notaA2=" + notaA2 + ", notaA3=" + notaA3 + "]";
    }

    public void cadastrar(){

        this.setNome(JOptionPane.showInputDialog("digite o nome do estudante"));
        this.setMatricula(JOptionPane.showInputDialog("digite o n° da matricula"));
        this.setCurso(JOptionPane.showInputDialog("digite o curso"));
        this.setUc(JOptionPane.showInputDialog("digite a Uc"));
        this.setEmail(JOptionPane.showInputDialog("digite o email"));
        this.setTel(JOptionPane.showInputDialog("digite o telefone"));
        
    }

    public void lancarNotas(){
        this.setNotaA1(Integer.parseInt(JOptionPane.showInputDialog("digite a nota da A1")));
        this.setNotaA2(Integer.parseInt(JOptionPane.showInputDialog("digite a nota da A2")));
        this.setNotaA3(Integer.parseInt(JOptionPane.showInputDialog("digite a nota da A3")));
    }



}
