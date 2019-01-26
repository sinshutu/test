workflow "workflow" {
  on = "push"
  resolves = ["hello"]
}

action "hello" {
  uses = "./.github/actions/hello"
}
