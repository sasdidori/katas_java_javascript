function shortestTime(n, m, speeds) {
  const differenceByFloors = Math.abs(n - m);
  const byLift =
    differenceByFloors * speeds[0] +
    speeds[1] +
    speeds[2] +
    (n - 1) * speeds[0] +
    speeds[1];
  const byWalk = (n - 1) * speeds[speeds.length - 1];
  return byLift < byWalk ? byLift : byWalk;
}
const logResult = shortestTime(5, 9, [2, 3, 3, 7]);
console.log(logResult);
