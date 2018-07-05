#!/bin/bash

java -classpath jooq-3.11.2.jar:jooq-meta-3.11.2.jar:jooq-codegen-3.11.2.jar:ojdbc6.jar:. org.jooq.codegen.GenerationTool jooq_gen.xml
