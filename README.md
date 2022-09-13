## Genera clases java a partir de protos y revisar el linting

Se deben incluir los protos en el directorio src/main/proto y lanzar mvn generate-sources

# Para chequear el linting

Abre una shell en la carpeta _/src/main/protolint_0.25.1_ y ejecuta el comando

``
./protolint lint --config_dir_path=./proto ../proto

``
