#! /bin/sh

echo $HOME
echo $GITHUB_WORKFLOW
echo $GITHUB_ACTION
echo $GITHUB_REPOSITORY
echo $GITHUB_WORKSPACE

ls $GITHUB_WORKSPACE

echo "[pwd]"
pwd

echo "[ls -al]"
ls -al

echo "[ls -la /]"
ls -la /

echo "[ls -la /github]"
ls -la /github

echo "[ls -la /github/workspace]"
ls -la /github/workspace
