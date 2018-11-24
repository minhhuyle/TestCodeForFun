interface RunOptions {
  program: string;
  commandline: string[]|string | (() => string);
}

var opts: RunOptions = {program: "", commandline: ""};
opts.commandline = '-hello world'; // OK
opts.commandline = ['-hello', 'world']; // OK
opts.commandline = "";

console.log("it's empty");

if (opts.commandline.length === 0) { // OK, string and string[] both have 'length' property
  console.log("it's empty");
}