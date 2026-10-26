const { User } = require("./user");

function createUser(name) {
  return new User(name);
}

function isValidName(name) {
  return typeof name === "string" && name.trim().length > 0;
}

module.exports = { createUser, isValidName };
