public class AlunoService  implements ICrud {

    @Override
    public Aluno salvar(Aluno object) {
        System.out.println("Salvando o objeto...");
        object.setID(1L);
        return object;

    }

    @Override
    public void deletar(Long id) {
        System.out.println("Deletando o objeto...");

    }

    @Override
    public void consultar(Long id) {
        System.out.println("Consultanto o objeto...");



    }

    @Override
    public void atualizar(Aluno object) {
        System.out.println("Atualizando o objeto...");

    }
}
