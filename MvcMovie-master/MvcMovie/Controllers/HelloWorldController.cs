using System;
using System.Collections.Generic;
using System.Linq;
using System.Text.Encodings.Web;
using System.Threading.Tasks;
using Microsoft.AspNetCore.Mvc;

namespace MvcMovie.Controllers
{
    public class HelloWorldController : Controller
    {
        //
        // GET: /HellowWorld/

        public string Index()
        {
            return "This is my default action";
        } // End Index()

        //
        // GET: /HellowWorld/Welcome/

        public string Welcome(string name, int numTimes = 1)
        {
            return HtmlEncoder.Default.Encode($"Hello {name}, NumTimes is : {numTimes} ") ;
        }

    }
}