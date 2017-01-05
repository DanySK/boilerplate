#!/bin/bash
openssl aes-256-cbc -K $encrypted_75ccbc63b5b6_key -iv $encrypted_75ccbc63b5b6_iv -in prepare_environment.sh.enc -out prepare_environment.sh -d
bash prepare_environment.sh
./gradlew
./gradlew uploadArchives
