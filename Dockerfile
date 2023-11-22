# Usando imagem Ubuntu como base, última versão (latest) 
FROM ubuntu:latest 
# Atualizando a base de pacotes de software 
RUN apt-get update 
# Instalando Gradle e OpenJDK (-y força a instalação sem perguntar) 
RUN apt-get install -y gradle openjdk-17-jdk 
# Copiando a pasta do projeto (./) para uma pasta App dentro da imagem 
COPY ./ /App/
# Mudando o diretório de trabalho para o diretório do App 
WORKDIR /App/ 
# Rodando o gradle. Rodado ao executar docker start. 
CMD ./gradlew build 