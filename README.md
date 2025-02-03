# Para crear las entidades de openapi se usa el siguiente commando:
npx @openapitools/openapi-generator-cli generate -i specs/api.yaml  -g spring  -p useSpringBoot=true -p library=spring-boot  -p useLombok=true  --additional-properties=useSpringBoot3=true,interfaceOnly=true,skipDefaultInterface=true  -o api --global-property models,apis -p apiPackage=com.inditex.prueba.api -p modelPackage=com.inditex.prueba.model --skip-validate-spec

# Para iniciar y probar el proyecto se usa maven 
Ejecutar los test: ./mvnw test
Iniciar el proyecto: ./mvnw spring-boot:run
