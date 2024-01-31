public interface IClienteDAO {

	public Integer cadastrar(Cliente cliente) throws Exception;

	public Integer atualizar(Cliente cliente) throws Exception;

	public List<Cliente> buscar(String criterio) throws Exception;

	public List<Cliente> buscarTodos() throws Exception;

	public Cliente consultar(String codigo) throws Exception;

	public Integer excluir(Cliente cliente) throws Exception;

	
}

}
