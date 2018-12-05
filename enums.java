interface enums{

}
enum SelectorsI implements enums{
    Random, Tournament, RouletteWheel;
 }

 enum EvaluatorsI implements enums{
    Rank;
 }

 enum ReproducersI implements enums{
    Multiply;
 }

 enum MutatorsI implements enums{
    Boundary;
 }
 enum SelectorsB implements enums{
    Random, Tournament, RouletteWheel;
 }
 enum EvaluatorsB implements enums{
    Length, Ratio;
 }

 enum ReproducersB implements enums{
    SinglePoint, TwoPoint, UniformPoint;
 }

 enum MutatorsB implements enums{
    RandomBitFlip;
 }