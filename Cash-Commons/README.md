# Cash Commons

### Descrição do projeto
> Esse projeto comtém os seguintes objetivos:
- Manter todas as classes de modelo em um único projeto.
- Ter todas as classes que são comuns para os outros microserviços juntas.
- Destribuir a lógica do sistema em microserviços.
- Organização.

### Testes
> O projeto commons contém algumas regas, elas são:
- Todas as classas de modelo devem implementar a interface "IModel"
- Todas as classes de modelo devem ter pelo menos o atributo "id"
- Todas as classes de modelo devem estar contidas dentro do pacote "Model"