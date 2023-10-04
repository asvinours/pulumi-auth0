// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Auth0.Inputs
{

    public sealed class ClientAddonsWamsGetArgs : global::Pulumi.ResourceArgs
    {
        [Input("masterKey")]
        private Input<string>? _masterKey;
        public Input<string>? MasterKey
        {
            get => _masterKey;
            set
            {
                var emptySecret = Output.CreateSecret(0);
                _masterKey = Output.Tuple<Input<string>?, int>(value, emptySecret).Apply(t => t.Item1);
            }
        }

        public ClientAddonsWamsGetArgs()
        {
        }
        public static new ClientAddonsWamsGetArgs Empty => new ClientAddonsWamsGetArgs();
    }
}
