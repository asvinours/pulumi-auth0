// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package auth0

import (
	"context"
	"reflect"

	"github.com/pkg/errors"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Multi-factor Authentication works by requiring additional factors during the login process to prevent unauthorized access. With this resource you can configure some of
// the options available for MFA.
//
// ## Example Usage
//
// ```go
// package main
//
// import (
// 	"github.com/pulumi/pulumi-auth0/sdk/v2/go/auth0"
// 	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
// )
//
// func main() {
// 	pulumi.Run(func(ctx *pulumi.Context) error {
// 		_, err := auth0.NewGuardian(ctx, "default", &auth0.GuardianArgs{
// 			Phone: &GuardianPhoneArgs{
// 				MessageTypes: pulumi.StringArray{
// 					pulumi.String("sms"),
// 				},
// 				Options: &GuardianPhoneOptionsArgs{
// 					EnrollmentMessage:   pulumi.String("{{code}}} is your verification code for {{tenant.friendly_name}}. Please enter this code to verify your enrollment"),
// 					VerificationMessage: pulumi.String("{{code}} is your verification code for {{tenant.friendly_name}}"),
// 				},
// 				Provider: pulumi.String("auth0"),
// 			},
// 			Policy: pulumi.String("all-applications"),
// 		})
// 		if err != nil {
// 			return err
// 		}
// 		return nil
// 	})
// }
// ```
type Guardian struct {
	pulumi.CustomResourceState

	// List(Resource). Configuration settings for the phone MFA. For details, see Phone.
	Phone GuardianPhonePtrOutput `pulumi:"phone"`
	// String. Policy to use. Available options are `never`, `all-applications` and `confidence-score`. The option `confidence-score` means the trigger of MFA will be adaptive. See [Auth0 docs](https://auth0.com/docs/mfa/adaptive-mfa)
	Policy pulumi.StringOutput `pulumi:"policy"`
}

// NewGuardian registers a new resource with the given unique name, arguments, and options.
func NewGuardian(ctx *pulumi.Context,
	name string, args *GuardianArgs, opts ...pulumi.ResourceOption) (*Guardian, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.Policy == nil {
		return nil, errors.New("invalid value for required argument 'Policy'")
	}
	var resource Guardian
	err := ctx.RegisterResource("auth0:index/guardian:Guardian", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetGuardian gets an existing Guardian resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetGuardian(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *GuardianState, opts ...pulumi.ResourceOption) (*Guardian, error) {
	var resource Guardian
	err := ctx.ReadResource("auth0:index/guardian:Guardian", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering Guardian resources.
type guardianState struct {
	// List(Resource). Configuration settings for the phone MFA. For details, see Phone.
	Phone *GuardianPhone `pulumi:"phone"`
	// String. Policy to use. Available options are `never`, `all-applications` and `confidence-score`. The option `confidence-score` means the trigger of MFA will be adaptive. See [Auth0 docs](https://auth0.com/docs/mfa/adaptive-mfa)
	Policy *string `pulumi:"policy"`
}

type GuardianState struct {
	// List(Resource). Configuration settings for the phone MFA. For details, see Phone.
	Phone GuardianPhonePtrInput
	// String. Policy to use. Available options are `never`, `all-applications` and `confidence-score`. The option `confidence-score` means the trigger of MFA will be adaptive. See [Auth0 docs](https://auth0.com/docs/mfa/adaptive-mfa)
	Policy pulumi.StringPtrInput
}

func (GuardianState) ElementType() reflect.Type {
	return reflect.TypeOf((*guardianState)(nil)).Elem()
}

type guardianArgs struct {
	// List(Resource). Configuration settings for the phone MFA. For details, see Phone.
	Phone *GuardianPhone `pulumi:"phone"`
	// String. Policy to use. Available options are `never`, `all-applications` and `confidence-score`. The option `confidence-score` means the trigger of MFA will be adaptive. See [Auth0 docs](https://auth0.com/docs/mfa/adaptive-mfa)
	Policy string `pulumi:"policy"`
}

// The set of arguments for constructing a Guardian resource.
type GuardianArgs struct {
	// List(Resource). Configuration settings for the phone MFA. For details, see Phone.
	Phone GuardianPhonePtrInput
	// String. Policy to use. Available options are `never`, `all-applications` and `confidence-score`. The option `confidence-score` means the trigger of MFA will be adaptive. See [Auth0 docs](https://auth0.com/docs/mfa/adaptive-mfa)
	Policy pulumi.StringInput
}

func (GuardianArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*guardianArgs)(nil)).Elem()
}

type GuardianInput interface {
	pulumi.Input

	ToGuardianOutput() GuardianOutput
	ToGuardianOutputWithContext(ctx context.Context) GuardianOutput
}

func (*Guardian) ElementType() reflect.Type {
	return reflect.TypeOf((**Guardian)(nil)).Elem()
}

func (i *Guardian) ToGuardianOutput() GuardianOutput {
	return i.ToGuardianOutputWithContext(context.Background())
}

func (i *Guardian) ToGuardianOutputWithContext(ctx context.Context) GuardianOutput {
	return pulumi.ToOutputWithContext(ctx, i).(GuardianOutput)
}

// GuardianArrayInput is an input type that accepts GuardianArray and GuardianArrayOutput values.
// You can construct a concrete instance of `GuardianArrayInput` via:
//
//          GuardianArray{ GuardianArgs{...} }
type GuardianArrayInput interface {
	pulumi.Input

	ToGuardianArrayOutput() GuardianArrayOutput
	ToGuardianArrayOutputWithContext(context.Context) GuardianArrayOutput
}

type GuardianArray []GuardianInput

func (GuardianArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*Guardian)(nil)).Elem()
}

func (i GuardianArray) ToGuardianArrayOutput() GuardianArrayOutput {
	return i.ToGuardianArrayOutputWithContext(context.Background())
}

func (i GuardianArray) ToGuardianArrayOutputWithContext(ctx context.Context) GuardianArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(GuardianArrayOutput)
}

// GuardianMapInput is an input type that accepts GuardianMap and GuardianMapOutput values.
// You can construct a concrete instance of `GuardianMapInput` via:
//
//          GuardianMap{ "key": GuardianArgs{...} }
type GuardianMapInput interface {
	pulumi.Input

	ToGuardianMapOutput() GuardianMapOutput
	ToGuardianMapOutputWithContext(context.Context) GuardianMapOutput
}

type GuardianMap map[string]GuardianInput

func (GuardianMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*Guardian)(nil)).Elem()
}

func (i GuardianMap) ToGuardianMapOutput() GuardianMapOutput {
	return i.ToGuardianMapOutputWithContext(context.Background())
}

func (i GuardianMap) ToGuardianMapOutputWithContext(ctx context.Context) GuardianMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(GuardianMapOutput)
}

type GuardianOutput struct{ *pulumi.OutputState }

func (GuardianOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**Guardian)(nil)).Elem()
}

func (o GuardianOutput) ToGuardianOutput() GuardianOutput {
	return o
}

func (o GuardianOutput) ToGuardianOutputWithContext(ctx context.Context) GuardianOutput {
	return o
}

type GuardianArrayOutput struct{ *pulumi.OutputState }

func (GuardianArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*Guardian)(nil)).Elem()
}

func (o GuardianArrayOutput) ToGuardianArrayOutput() GuardianArrayOutput {
	return o
}

func (o GuardianArrayOutput) ToGuardianArrayOutputWithContext(ctx context.Context) GuardianArrayOutput {
	return o
}

func (o GuardianArrayOutput) Index(i pulumi.IntInput) GuardianOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *Guardian {
		return vs[0].([]*Guardian)[vs[1].(int)]
	}).(GuardianOutput)
}

type GuardianMapOutput struct{ *pulumi.OutputState }

func (GuardianMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*Guardian)(nil)).Elem()
}

func (o GuardianMapOutput) ToGuardianMapOutput() GuardianMapOutput {
	return o
}

func (o GuardianMapOutput) ToGuardianMapOutputWithContext(ctx context.Context) GuardianMapOutput {
	return o
}

func (o GuardianMapOutput) MapIndex(k pulumi.StringInput) GuardianOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *Guardian {
		return vs[0].(map[string]*Guardian)[vs[1].(string)]
	}).(GuardianOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*GuardianInput)(nil)).Elem(), &Guardian{})
	pulumi.RegisterInputType(reflect.TypeOf((*GuardianArrayInput)(nil)).Elem(), GuardianArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*GuardianMapInput)(nil)).Elem(), GuardianMap{})
	pulumi.RegisterOutputType(GuardianOutput{})
	pulumi.RegisterOutputType(GuardianArrayOutput{})
	pulumi.RegisterOutputType(GuardianMapOutput{})
}
