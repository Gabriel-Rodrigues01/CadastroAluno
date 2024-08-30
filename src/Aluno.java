public class Aluno {
    private long ID;
    private String Nome;
    private long CPF;


    public Aluno (long ID, String Nome, long CPF){
        this.ID = ID;
        this.Nome = Nome;
        this.CPF = CPF;
    }

    public long getID() {
        return ID;
    }

    public void setID(long ID) {
        this.ID = ID;
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String nome) {
        Nome = nome;
    }

    public long getCPF() {
        return CPF;
    }

    public void setCPF(long CPF) {
        this.CPF = CPF;
    }
}
