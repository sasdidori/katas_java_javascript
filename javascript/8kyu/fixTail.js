//zookeeper at the entrance
//all the animals have a body and a tail
//last part of the body and the tail must match
//last letter of the body and the tail has to equal
//1 animal arrives
//check the last letter of the body
//check the tail
//compare them
//if they are identical -> true
// if they aren't identical -> false

function correctTail(body, tail) {
  return body.endsWith(tail) ? true : false;
}
