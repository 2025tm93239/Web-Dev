const { createUser, isValidName } = require("./userService");

if (createUser("Alice").getName() !== "Alice") {
  throw new Error("createUser test failed for Alice");
}
if (createUser("Bob").getName() !== "Bob") {
  throw new Error("createUser test failed for Bob");
}
if (!isValidName("Web-Dev")) {
  throw new Error("isValidName should be true");
}
if (isValidName("   ")) {
  throw new Error("isValidName should be false for blank");
}

console.log("testRunner v1.0.4: 4 tests passed");