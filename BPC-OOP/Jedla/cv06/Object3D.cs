using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace cv06
{
    public abstract class Object3D :GroupOfObjects
    {
        public abstract double ComputeSurface();
        public abstract double ComputeVolume();

        
    }
}
