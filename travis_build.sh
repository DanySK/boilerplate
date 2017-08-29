#!/bin/bash
set -e
openssl aes-256-cbc -K $encrypted_f6fa8cf5bc89_key -iv $encrypted_f6fa8cf5bc89_iv -in prepare_environment.sh.enc -out prepare_environment.sh -d
bash prepare_environment.sh
./gradlew
./gradlew uploadArchives
