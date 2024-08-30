public interface ICrud {
    public Aluno salvar (Aluno object);
    public void deletar (Long id);
    public void consultar(Long id);
    public void atualizar(Aluno object);

   }

