java -classpath bin:randoop-all-4.0.4.jar:junit-4.12.jar randoop.main.Main gentests --testclass=ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome --testclass=ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector --junit-output-dir=test --regression-test-basename=BitChromosomeTest  --junit-package-name=prueba --time-limit=5 --null-ratio=0 --forbid-null=true --flaky-test-behavior=OUTPUT