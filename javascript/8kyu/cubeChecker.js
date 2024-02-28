//volume = Length * Width * Height
// 125 = 5 * 5 * 5
//volume = 125
//length = 5

//if length = 5, then width = 5 and height = 5
// multiple length * width * height
// if length * width * heigth = volume, then it's a cuboid
// if it's not true, its not a cuboid
//if the volume or side <= 0 ----> false

function cubeChecker(volume, length) {
  if (volume <= 0 || length <= 0) {
    return false;
  }
  const width = length;
  const height = length;
  const result = width * height * length;
  const isCuboid = result == volume;
  return isCuboid;
}

const logResult = cubeChecker(125, 5);
console.log(logResult);
